package com.example.fatecompanion;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class CampaignListView extends Activity {

	private Long characterID;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_list_view);
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.campaign_list_view, menu);
        return true;
    }
	
	@Override
	protected void onStart() {
		super.onStart();
		
		( (LinearLayout) this.findViewById( R.id.LinearLayout1 ) ).removeAllViews();
		
		Intent intent = this.getIntent();
        
        this.characterID = intent.getLongExtra( "characterID", 0L );
        
        ArrayList<Long> campaignIDs = CharacterController.getInstance().getCampaignIDsByCharacterID( characterID );
        
        for ( Long ID : campaignIDs )
        {
        	CampaignListWidget temp = new CampaignListWidget( this, ID );
			temp.setClickable( true );		
			
			OnClickListener click = new OnClickListener() {
				
				public void onClick( View v )
				{
					goToCharacterSheet( characterID, ((CampaignListWidget) v).getCampaignID() );
				}
			};
			
			temp.setOnClickListener( click );
			
			( (LinearLayout) this.findViewById( R.id.LinearLayout1 ) )
				.addView( temp );
        }
        
        /* Add character create button */
		
		Button addCamp = new Button( this );
		addCamp.setText( "Add Campaign" );
		addCamp.setClickable( true ); // TODO: Figure out if necessary
		
		OnClickListener click_button = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				goToCampaignCreate( characterID );
			}
		};
		
		addCamp.setOnClickListener( click_button );
		
		((LinearLayout) this.findViewById( R.id.LinearLayout1 ) ).addView( addCamp );
	}

	private void goToCharacterSheet( Long characterID, Long campaignID )
	{
		Intent intent = new Intent( this, CharacterSheetView.class );
		intent.putExtra( "characterID", characterID );
		intent.putExtra( "campaignID", campaignID );
		
		this.startActivity( intent );
	}

	private void goToCampaignCreate( Long characterID )
	{
		Intent intent = new Intent( this, CampaignCreateView.class);
		intent.putExtra( "characterID", characterID );
		
		this.startActivity( intent );
	}
    
}
