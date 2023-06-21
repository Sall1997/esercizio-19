/**ESERCIZIO 19
 * In questa classe ci sono metodi per fare alcuni giochini con le parole
 *
 * @author Sall
 */
public class WordGames {

    /**---------------------------------------------------------
     * aggiunge la parola hello prima della la tua parola
     *
     * @param word la parola a cui si vuole precedere la parola Hello
     * @return ritorna la frase: "hello [parola inserita come parametro]"
     */
   public String addHelloWord( String word){
       return "Hello" + " " + word;
    }

    /**--------------------------------------------------------
     * unisce il nome e il cognome
     *
     * @param name il nome che si preferisce
     * @param surName il cognome che si preferisce
     * @return ritorna l'unione del nome e del cognome
     */
    public String getFullName (String name, String surName) {
       return name + " " + surName;
    }
}
