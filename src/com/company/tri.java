package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class tri {

    Person[] people;
    public void runExercise() throws Exception {
        // d'autres éléments seront ajoutés
        // lors de l'exécution
        this.people = new Person[] {
                new Person("mark", 50 ),
                new Person("aaron", 40 )
        };

        // triez ce tableau par la propriété age puis par la propriété name

        /*----------NE MODIFIEZ PAS LE CODE AU DESSUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/

        /**** Entrez votre code ici ****/

        class PersonComparator implements Comparator<Person> {
            public int compare( Person a, Person b ) {
                if (a.getAge() == b.getAge() ) {
                    return ( a.getName().compareTo( b.getName() ) );
                }
                return  (a.getAge() < b.getAge()) ? -1 : 1;
            }
        }
        Arrays.sort( this.people, new PersonComparator() );


        for ( Person perp : people ) {
            System.out.println( perp );
        }
    }
}
class Person {
    private String name;
    private int age;

    Person( String name, int age ) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public String toString() {
        return this.name+" ("+this.age+")";
    }
}



