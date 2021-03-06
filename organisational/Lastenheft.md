-- Aufbau


## 1. Zielbestimmung

Bisher werden die Charaktere der Spieler durch einige Dokumente verwaltet. Dadurch ist es f�r jede Session aufw�ndig alle ben�tigten Bl�tter und W�rfel zu organisieren. Au�erdem empfinden die Spieler es als l�stig st�ndig �nderungen an ihren Character Sheets vorzunehmen und diese damit immer weiter zu verschandeln.
Ziel soll es also sein den Spielern diesen organisatorischen Aufwand teilweise abzunehmen und ihre M�glichkeiten zu unterst�tzen. 
Folgende Anforderungen soll das Programm dabei erf�llen:

- Die Applikation muss es erlauben vier W�rfel zu w�rfeln. Diese sind Fudge Dice (6 seitige W�rfel mit jeweils 2 Seiten auf denen ein Plus, Minus und Nichts abgebildet ist).
- In der W�rfelansicht m�ssen zudem mindestens die Approaches/Skills/Modes �bersichtlich angezeigt werden.
- Das System soll aus 2 Ansichten bestehen: eine Ansicht, in der gew�rfelt wird, und eine Ansicht, in der das aktive Character Sheet betrachtet werden kann.
- Das System muss die offiziellen Character Sheets von Fate Core, Fate Accelerated Edition und Atomic Robo �bersichtlich darstellen k�nnen.
- Aus der Character-Sheet-Ansicht heraus muss das Character Sheet bearbeitet werden k�nnen. Die Editierungen m�ssen den Regeln des entsprechenden Systems zu jedem Zeitpunkt entsprechen.
- Nutzer m�ssen w�hrend des Betriebs des Systems den aktiven Charakter (aktiv := dessen Character Sheets momentan betrachtet und editiert werden kann) wechseln k�nnen.

Das Programm soll bis Ende des Jahres 2015 fertiggestellt werden. Support soll f�r mindestens ein (1) weiteres Jahr angeboten werden. Folgeauftr�ge zur Erweiterung der Applikation sind bei entsprechender Qualit�t sehr wahrscheinlich.



## 2. Produkteinsatz
- Das Produkt soll auf Android Smartphones (Mindestversion: 4.0.3) ausgef�hrt werden.
- Das Produkt soll von teilweise nicht sehr technisch versierten Nutzern eingesetzt werden.
- Das Produkt soll in englischer Sprache verfasst werden.


## 3. Produktfunktionen

-- LF 0100 - W�rfelansicht
- LF 0110 - W�rfeln: W�rfeln von vier Fudge Dice/Fate Dice mit anschlie�ender Anzeige der Einzelergebnisse der W�rfel in Form von aussagekr�ftigen Symbolen und Anzeige des Gesamtergebnisses im Zahlenformat (-4 bis +4).

-- LF 0200 - Charakteransicht
- LF 0210 - Kampagne erstellen: Erstellung einer Kampagne durch Eingabe aller erforderlichen Daten und eventueller optionaler Daten zur n�heren Beschreibung.
- LF 0220 - Charakter erstellen: Erstellung eines Charakters innerhalb einer bereits erstellten Kampagne durch Eingabe der erforderlichen Daten. �ber die Kampagne wird dabei das zu verwendende System (damit auch die zu verwendende Character Sheet Vorlage) bestimmt. Die Charaktererstellung soll dabei in kleinen Schritten unterst�tzt werden.
- LF 0230 - Character Sheet bearbeiten: �ffnen einer weiteren Ansicht, in der die Daten des aktiven Character Sheets bearbeitet werden k�nnen.
- LF 0240 - Character Sheet Bearbeitung beenden: Schlie�t die Bearbeitung der Daten ab und f�hrt den Nutzer zur�ck in die �bersicht der Daten des Charakters. Die Daten werden dabei auf dem neuen aktuellen Stand angezeigt.
- LF 0250 - aktiven Charakter wechseln: Wechseln des aktiven Charakters zu einem Anderen in gegebenenfalls einer anderen Kampagne.


## 4. Produktdaten

-- LD 0100 - W�rfel
- 

-- LD 0200 - Charakteransicht
- LD 0210 - Name: Name des Charakters
- LD 0220 - Beschreibung: kurze Beschreibung (Pers�nlichkeit, Aussehen, ...)
- LD 0230 - System: FAE, Fate Core oder Atomic Robo

-- LD 0300 - Kampagne
- LD 0310 - Name: Titel der Kampagne
- LD 0320 - Beschreibung: Setting der Kampagne (grober Anriss der Story, Umgebungsaspekte)
- LD 0330 - Datum: Datum, an dem ein Charakter der Kampagne gespielt wurde
- LD 0340 - System: FATE, Fate Core oder Atomic Robo
- LD 0350 - beteiligte Charaktere: Liste beteiligter Charaktere mit Verweisen auf deren Character Sheets



## 5. Produktleistungen

- Wechsel zwischen den Ansichten f�r W�rfeln und die �bersicht des Character Sheets muss in h�chstens einer (1) Sekunde vonstatten gehen.
- W�rfelergebnis muss nach h�chstens zwei (2) Sekunden angezeigt werden.
- Energiespeicherbedarf der App sollte gering sein.


## 6. Qualit�tsanforderungen

-- sehr gut
- Aussehen und Handhabung (Look and Feel)
- Benutzbarkeit

-- normal
- Korrektheit
- Wartbarkeit und �nderbarkeit
- Leistung und Effizienz
- Portierbarkeit
- Zuverl�ssigkeit

-- irrelevant
- Sicherheitsanforderungen
- Flexibilit�t
- Skalierbarkeit
- Betrieb und Umgebungsbedingungen
