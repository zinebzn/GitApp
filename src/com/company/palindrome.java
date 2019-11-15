package com.company;

public class palindrome {

    public void isPalindrome( String str ) {
        /*----------NE MODIFIEZ PAS LE CODE AU DESSUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/

        /**** Entrez votre code ici ****/
        boolean test=true;

        for ( int x=0, y=(str.length()-1); x<y; x++,y-- ) {
            String start = str.substring( x, x+1 ).toLowerCase();
            String end   = str.substring( y, y+1 ).toLowerCase();

            if ( !  start.equals( end )  ) {
                test = false;
            }
            else {
                test = true;
            }
        }
        if (test){
            System.out.println(str + " est un palindrome !");
        }
        else {
            System.out.println(str + " n'est pas un palindrome !");
        }


        /*----------NE MODIFIEZ PAS LE CODE EN DESSOUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/
    }
}
