package it.ing.sw;

import java.io.Serializable;

public class Costanti implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final String SALUTO_INIZIALE = "Benvenuto nell'applicazione per la gestione di risorse multimediali\n";
	public static final String SALUTO_FINALE = "Arrivederci, alla prossima!\n";
	public static final String INTESTAZIONE_A = "IN QUALE MODALITA VUOI ACCEDERE?";
	public static final String[] OPZIONI_A = { "Fruitore", "Operatore", "Esci" };
	public static final String INTESTAZIONE_B = "SCEGLI UN'OPZIONE";
	public static final String[] OPZIONI_B = { "Iscriviti come nuovo fruitore", "Accedi", "Indietro" };
	public static final String INTESTAZIONE_C = "ACCESSO FRUITORE";
	public static final String[] OPZIONI_C = { "Inserisci username e password", "Indietro" };
	public static final String INTESTAZIONE_D = "COSA DESIDERI FARE?";
	public static final String[] OPZIONI_D_12 = { "Rinnova iscrizione", "Visualizza profilo", "Logout" };
	public static final String [] OPZIONI_D_345 = {"Rinnova iscrizione", "Visualizza profilo", "Visualizza prestiti in corso", "Richiedi un nuovo prestito", "Richiedi proroga per un prestito", "Ricerca risorsa", "Valuta disponibilita'", "Logout"};
	public static final String INTESTAZIONE_E = "ACCESSO OPERATORE";
	public static final String[] OPZIONI_E = { "Inserisci username e password", "Indietro" };
	public static final String INTESTAZIONE_F = "COSA DESIDERI FARE?";
	public static final String[] OPZIONI_F_1 = { "Visualizza anagrafica fruitori", "Logout" };
	public static final String [] OPZIONI_F_2 = {"Visualizza anagrafica fruitori", "Visualizza archivio", "Aggiungi risorsa", "Rimuovi risorsa", "Logout"};
	public static final String [] OPZIONI_F_34 = {"Visualizza anagrafica fruitori", "Visualizza archivio", "Aggiungi risorsa", "Rimuovi risorsa", "Ricerca risorsa", "Valuta disponibilita' risorsa", "Logout"};

	public static final String INS_NOME = "Inserisci il tuo nome: ";
	public static final String INS_COGNOME = "Inserisci il tuo cognome: ";
	public static final String INS_USERNAME = "Inserisci il tuo username: ";
	public static final String INS_PASSWORD = "Inserisci la tua password: ";
	public static final String INS_GIORNO_NASCITA = "Inserisci il tuo giorno di nascita (in cifre): ";
	public static final String INS_MESE_NASCITA = "Inserisci il tuo mese di nascita (in cifre): ";
	public static final String INS_ANNO_NASCITA = "Inserisci il tuo anno di nascita (indicare 4 cifre): ";

	public static final String ISCRIZIONE_OK = "Complimenti, iscrizione avvenuta con successo!\n";
	public static final String ISCRIZIONE_NON_OK = "Non e' stato possibile iscrivere alcun utente\n";
	public static final String ISCRIZIONE_NON_OK_OMONIMIA_FRUITORI = "ATTENZIONE! Le credenziali inserite non sono valide poiche' gia' in uso.\n";
	public static final String ISCRIZIONE_NON_OK_STESSO_USERNAME = "ATTENZIONE! Lo username indicato non e' valido poiche' gia' in uso.\n";
	public static final String ISCRIZIONE_NON_OK_MAGGIORE_ETA = "ATTENZIONE! L'utente indicato non puo' iscriversi in quanto non e' maggiorenne.\n";

	public static final String RINNOVO_OK = "Il rinnovo dell'iscrizione e' avvenuto con successo.\n";
	public static final String RINNOVO_NON_OK = "Non e' possibile effettuare il rinnovo dell'iscrizione.\n";

	public static final String USERNAME = "Username: ";
	public static final String PASSWORD = "Password: ";
	public static final String CREDENZIALI_ERRATE = "ATTENZIONE! Lo username e/o la password non sono validi.\n";
	public static final String DATA_DI_NASCITA_ERRATA = "ATTENZIONE! La data di nascita inserita non e' valida.\n";

	public static final String RICHIESTA_PROSECUZIONE = "Si desidera riprovare? (S/N)\n";
	public static final String ERRORE = "Si e' verificato un errore\n";

	public static final String CONTENUTO_ARC = "L'archivio contiene le seguenti categorie:\n%s\n";
	public static final String CONTENUTO_CAT_RISORSA = "La categoria %s contiene queste risorse:\n%s\n";
	public static final String CAT_SENZA_SOTTO = "La categoria %s non presenta sottocategorie in quanto contiene direttamente le risorse\n";
	public static final String CONTENUTO_ELENCO_SOTTO_VUOTO = "Per la categoria %s è in corso l'aggiunta di sottocategorie, in questo momento non è possibile effettuare operazioni\n";
	public static final String CONTENUTO_ELENCO_RISORSE_CAT_VUOTO = "La categoria %s non contiene delle risorse quindi non e' possibile effettuare operazioni\n";	
	public static final String CONTENUTO_ELENCO_RISORSE_SOTTO_VUOTO = "La sottocategoria %s non contiene delle risorse quindi non e' possibile effettuare operazioni\n";	
	public static final String CONTENUTO_CAT_SOTTO = "La categoria %s contiene queste sottocategorie:\n%s\n";
	public static final String CONTENUTO_SOTTO = "La sottocategoria %s contiene queste risorse:\n%s\n"; 
	
	public static final String OP_SUCCESSO = "L'operazione e' avvenuta con successo\n";
    public static final String OP_NO_SUCCESSO_AGGIUNTA = "Attenzione! La risorsa e' gia' presente nell'archivio oppure la risorsa non e' compatibile con la sottocategoria dove si vuole inserire\n";
    public static final String OP_NO_SUCCESSO_PRESTITO = "Attenzione! La risorsa indicata non e' presente in archivio e/o non e' disponibile\n";
	public static final String OP_NO_SUCCESSO_PROROGA_1 = "Attenzione! Non e' stato possibile effettuare la proroga richiesta\n";
	public static final String OP_NO_SUCCESSO_PROROGA_2 = "Al momento non ci sono prestiti in corso quindi non e' possibile effettuare una proroga\n";
 
    public static final String INS_NUMERO_CAT_AGGIUNTA_RISORSA = "Inserisci il numero della categoria a cui aggiungere la risorsa:\n";
    public static final String INS_NUMERO_CAT_RIMOZIONE_RISORSA = "Inserisci il numero della categoria a cui rimuovere la risorsa:\n";
 
    public static final String INS_NUMERO_SOTTO_AGGIUNTA_RISORSA =  "Inserisci il numero della sottocategoria a cui aggiungere la risorsa:\n";
    public static final String INS_NUMERO_SOTTO_RIMOZIONE_RISORSA =  "Inserisci il numero della sottocategoria a cui rimuovere la risorsa:\n";

    public static final String INS_NUMERO_RISORSA_RIMOZIONE = "Inserisci il numero della risorsa da rimuovere:\n";
    
    public static final String INS_PROCEDERE_CAT = "Vuoi proseguire nella scelta della categoria (S/N)?\n";
    public static final String INS_PROCEDERE_SOTTO = "Vuoi proseguire nella scelta della sottocategoria (S/N)?\n";
    public static final String INS_PROCEDERE_RISORSA = "Vuoi proseguire nella scelta della risorsa? (S/N)\n";
        
    public static final String INS_NUMERO_CAT_PRESTITO = "Inserisci il numero della categoria di cui vuoi richiedere un prestito:\n";
    public static final String INS_NUMERO_SOTTO_PRESTITO =  "Inserisci il numero della sottocategoria in cui cercare la risorsa:\n";
    public static final String INS_NUMERO_RISORSA_PRESTITO = "Inserisci il numero della risorsa da richiedere in prestito:\n";      

    public static final String INS_NUMERO_PRESTITO_PROROGA = "Inserisci il numero del prestito di cui vuoi richiedere la proroga:";      
    
    public static final String INS_TITOLO_RISORSA = "Inserisci il titolo: ";      
    public static final String INS_AUTORE_LIBRO = "Inserisci il cognome di un autore: ";      
    public static final String INS_GENERE_RISORSA = "Inserisci il genere: ";      
    public static final String INS_ANNOPUB_RISORSA = "Inserisci l'anno di pubblicazione: ";      
    public static final String INS_CASAED_LIBRO = "Inserisci la casa editrice: "; 
    
    public static final String INS_REGISTA_FILM = "Inserisci il cognome di un regista: ";      
    public static final String INS_ATTORE_FILM = "Inserisci il cognome di un attore: ";      

    public static final String INS_NUMERO_CAT_RICERCA = "Inserisci il numero della categoria in cui vuoi cercare la risorsa:\n";
	public static final String AVVIO_RICERCA_RISORSE = "Come intendi ricercare la risorsa?\n1-Per titolo\n2-Per autore\n3-Per genere\n4-Per anno di pubblicazione\n5-Per casa editrice\n\nDigitare un numero:\n";
 	public static final String AVVIO_RICERCA_LIBRI = "Come intendi ricercare il libro?\n1-Per titolo\n2-Per autore\n3-Per anno di pubblicazione\n4-Per casa editrice\n\nDigitare un numero:\n";
  	public static final String AVVIO_RICERCA_FILM = "Come intendi ricercare il film?\n1-Per titolo\n2-Per regista\n3-Per attore\n4-Per anno di pubblicazione\n5-Per genere\n\nDigitare un numero:\n";
	public static final String INTESTAZIONE_RICERCA_RISORSE = "Elenco delle risorse trovate: \n";
	public static final String RICHIESTA_DIGITAZIONE_VALUTAZIONE = "Digitare il numero della risorsa scelta:\n";
	public static final String RICERCA_VUOTA = "Non sono state trovate delle risorse\n";
	public static final String RISORSA_DISPONIBILE = "La risorsa indicata e' disponibile\n";
	public static final String RISORSA_NON_DISPONIBILE = "La risorsa indicata non e' disponibile\n";

	public static final int MAGGIORE_ETA = 18;
	public static final int NUM_MINIMO = 1;
	public static final int VUOTO = 0;
	
	public static final int NUM_MASSIMO_RICERCA = 5;
}
