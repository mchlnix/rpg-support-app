package com.example.fatecompanion.view;

import java.util.ArrayList;

import com.example.fatecompanion.R;
import com.example.fatecompanion.controller.CharacterController;
import com.example.fatecompanion.model.Character;
import com.example.fatecompanion.view.create.CharacterCreateView;
import com.example.fatecompanion.widget.CharacterListWidget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class CharacterListView extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_character_list_view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		/*getMenuInflater().inflate(R.menu.character_list_view, menu);*/
		return true;
	}

	@Override
	protected void onStart() {
		super.onStart();
		
		( (LinearLayout) this.findViewById( R.id.LinearLayout1 ) ).removeAllViews();
		
		ArrayList<Long> characterIDs = CharacterController.getInstance(getApplicationContext()).getAllCharacterIDs();
		
		for ( Long ID : characterIDs )
		{
			CharacterListWidget temp_widget = new CharacterListWidget( this, ID );
        	
        	Character temp_char = CharacterController.getInstance(this).getCharacterByID( ID );
        	
        	temp_widget.setTitle( temp_char.getName() );
        	temp_widget.addInfo( temp_char.getDescription() );
        	if ( CharacterController.getInstance(this).getLastPlayed( ID ).getTime() == 0L )
        		temp_widget.addInfo( "Not in play" );
        	else
        		temp_widget.addInfo( CharacterController.getInstance(this).getLastPlayed( ID ).toString() );
        	temp_widget.setRandomColor( ID );
			temp_widget.setClickable( true );		
			
			OnClickListener click = new OnClickListener() {
				
				public void onClick( View v )
				{
					goToCampaign( ((CharacterListWidget) v).getCharacterID() );
				}
			};
			
			temp_widget.setOnClickListener( click );
			
			( (LinearLayout) this.findViewById( R.id.LinearLayout1 ) )
				.addView( temp_widget );
		}
		
		/* Add character create button */
		
		Button addChar = new Button( this );
		addChar.setText( "Add Character" );
		addChar.setClickable( true );
		
		OnClickListener click_button = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goToCharacterCreate();
			}
		};
		
		addChar.setOnClickListener( click_button );
		
		((LinearLayout) this.findViewById( R.id.LinearLayout1 ) ).addView( addChar );
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void goToCharacterCreate()
	{
		Intent intent = new Intent( this, CharacterCreateView.class );
		this.startActivity( intent );
	}
	
	private void goToCampaign( Long characterID )
	{
		Intent intent = new Intent( this, CampaignListView.class );
		intent.putExtra( "characterID", characterID );
		
		this.startActivity( intent );
	}
}
