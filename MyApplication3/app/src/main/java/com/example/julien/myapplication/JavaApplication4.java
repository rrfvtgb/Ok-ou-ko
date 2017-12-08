
package com.example.julien.myapplication;

public class JavaApplication4 {

    public static String initJava(){
        String[][] tab = new String[5][4];
        //Droite
        tab[0][0]="System.out.println(\"A un panneau Stop, je m'arrete 5 secondes\");";
        tab[1][0]="for(int i=0;i<5;i++){\n" +
"	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
"	Thread.sleep(1000);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer.\");";
        tab[2][0]="if( voitureADroite() && pasDeSigne())\n" +
"	System.out.println(\"Je laisse passer la voiture de droite.\");";
        tab[3][0]="while( voitureADroite() || voitureAGauche()){\n" +
"	Thread.sleep(500);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer.\");";
        tab[4][0]="Switch( getAlcoolemie() ){\n" +
"	case 0 :\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break;\n" +
"	case 1 :\n" +
"		System.out.println(\"Risque d'accident\");\n" +
"	break;\n" +
"	case 2 :\n" +
"		System.out.println(\"Risque de mort\");\n" +
"	break;\n" +
"	case 3 :\n" +
"		System.out.println(\"Comment je suis encore debout ?\");\n" +
"	break;\n" +
"}";
        //Gauche
        tab[0][1]="System.out.println(\"A un panneau Stop, je ne m'arrete pas s'il n'y a pas de voitures\");";
        tab[1][1]="for(int i=0;i<1;i++){\n" +
"	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
"	Thread.sleep(1000);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer.\");";
        tab[2][1]="if( voitureADroite() && pasDeSigne())\n" +
"	System.out.println(\"Je grille la priorité a la voiture de droite.\");";
        tab[3][1]="while( voitureADroite() || voitureAGauche() || true){\n" +
"	Thread.sleep(500);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer\");";
        tab[4][1]="Switch( getAlcoolemie() ){\n" +
"	case 0 :\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break;\n" +
"	case 1 :\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break;\n" +
"	case 2 :\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break;\n" +
"	case 3 :\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break;\n" +
"}";
        //Haut
        tab[0][2]="System.out.println(\"Quand Noël approche, je prépare des cadeaux pour mes proches\");";
        tab[1][2]="for(int i=0;i<37;i++){\n" +
"	System.out.println(i+\" mouton(s).\");\n" +
"	Thread.sleep(500);\n" +
"}\n" +
"System.out.println(\"Zzzzzzzzzz\");";
        tab[2][2]="if( jeSuisFatigue() && codeAFaire())\n" +
"	System.out.println(\"Je dors sur mon ordinateur\");";
        tab[3][2]="while( travailEnCours() || musiqueEnCours()){\n" +
"	Thread.sleep(20000);\n" +
"}\n" +
"System.out.println(\"Zzzzzzzzzz\");";
        tab[4][2]="Switch( getHeure() ){\n" +
"	case 0 :\n" +
"		System.out.println(\"On parle.\");\n" +
"	break;\n" +
"	case 1 :\n" +
"		System.out.println(\"On reflechit.\");\n" +
"	break;\n" +
"	case 2 :\n" +
"		System.out.println(\"On travail.\");\n" +
"	break;\n" +
"	case 3 :\n" +
"		System.out.println(\"On joue ou je regarde un anime.\");\n" +
"	break;\n" +
"	case 4 :\n" +
"		System.out.println(\"On travail.\");\n" +
"	break;\n" +
"	case 5 :\n" +
"		System.out.println(\"On travail.\");\n" +
"	break;\n" +
"	case 6 :\n" +
"		System.out.println(\"On joue ou je regarde un anime\");\n" +
"	break;\n" +
"	case 7 :\n" +
"		System.out.println(\"Fini!\");\n" +
"	break;\n" +
"}";
        //Bas
        tab[0][3]="System.out.println(A un panneau Stop, je m'arrete 5 secondes);";
        tab[1][3]="for(int i=0;i<5){\n" +
"	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
"	Thread.sleep(1000);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer.\");";
        tab[2][3]="if( voitureADroite() & pasDeSigne()\n" +
"	System.out.println(\"Je laisse passer la voiture de droite.\");";
        tab[3][3]="while( voitureADroite() OR voitureAGauche()){\n" +
"	Thread.sleep(500);\n" +
"}\n" +
"System.out.println(\"Je peux démarrer.\");";
        tab[4][3]="Switch( getAlcoolemie() ){\n" +
"	case 0\n" +
"		System.out.println(\"Je peux conduire\");\n" +
"	break\n" +
"	case 1\n" +
"		System.out.println(\"Risque d'accident\");\n" +
"	break\n" +
"	case 2\n" +
"		System.out.println(\"Risque de mort\");\n" +
"	break\n" +
"	case 3\n" +
"		System.out.println(\"Comment je suis encore debout ?\");\n" +
"	break\n" +
"}";

        return tab[rand(5)][rand(4)];
    }


    //retourne 1 si droite est la bonne reponse, 2 si gauche est la bonne reponse
    //3 si haut est la bonne reponse , 4 si bas est la bonne reponse
    public static int getReponse(String str){
        String[][] tab = new String[5][4];
        //Droite
        tab[0][0]="System.out.println(\"A un panneau Stop, je m'arrete 5 secondes\");";
        tab[1][0]="for(int i=0;i<5;i++){\n" +
                "	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
                "	Thread.sleep(1000);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer.\");";
        tab[2][0]="if( voitureADroite() && pasDeSigne())\n" +
                "	System.out.println(\"Je laisse passer la voiture de droite.\");";
        tab[3][0]="while( voitureADroite() || voitureAGauche()){\n" +
                "	Thread.sleep(500);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer.\");";
        tab[4][0]="Switch( getAlcoolemie() ){\n" +
                "	case 0 :\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break;\n" +
                "	case 1 :\n" +
                "		System.out.println(\"Risque d'accident\");\n" +
                "	break;\n" +
                "	case 2 :\n" +
                "		System.out.println(\"Risque de mort\");\n" +
                "	break;\n" +
                "	case 3 :\n" +
                "		System.out.println(\"Comment je suis encore debout ?\");\n" +
                "	break;\n" +
                "}";
        //Gauche
        tab[0][1]="System.out.println(\"A un panneau Stop, je ne m'arrete pas s'il n'y a pas de voitures\");";
        tab[1][1]="for(int i=0;i<1;i++){\n" +
                "	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
                "	Thread.sleep(1000);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer.\");";
        tab[2][1]="if( voitureADroite() && pasDeSigne())\n" +
                "	System.out.println(\"Je grille la priorité a la voiture de droite.\");";
        tab[3][1]="while( voitureADroite() || voitureAGauche() || true){\n" +
                "	Thread.sleep(500);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer\");";
        tab[4][1]="Switch( getAlcoolemie() ){\n" +
                "	case 0 :\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break;\n" +
                "	case 1 :\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break;\n" +
                "	case 2 :\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break;\n" +
                "	case 3 :\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break;\n" +
                "}";
        //Haut
        tab[0][2]="System.out.println(\"Quand Noël approche, je prépare des cadeaux pour mes proches\");";
        tab[1][2]="for(int i=0;i<37;i++){\n" +
                "	System.out.println(i+\" mouton(s).\");\n" +
                "	Thread.sleep(500);\n" +
                "}\n" +
                "System.out.println(\"Zzzzzzzzzz\");";
        tab[2][2]="if( jeSuisFatigue() && codeAFaire())\n" +
                "	System.out.println(\"Je dors sur mon ordinateur\");";
        tab[3][2]="while( travailEnCours() || musiqueEnCours()){\n" +
                "	Thread.sleep(20000);\n" +
                "}\n" +
                "System.out.println(\"Zzzzzzzzzz\");";
        tab[4][2]="Switch( getHeure() ){\n" +
                "	case 0 :\n" +
                "		System.out.println(\"On parle.\");\n" +
                "	break;\n" +
                "	case 1 :\n" +
                "		System.out.println(\"On reflechit.\");\n" +
                "	break;\n" +
                "	case 2 :\n" +
                "		System.out.println(\"On travail.\");\n" +
                "	break;\n" +
                "	case 3 :\n" +
                "		System.out.println(\"On joue ou je regarde un anime.\");\n" +
                "	break;\n" +
                "	case 4 :\n" +
                "		System.out.println(\"On travail.\");\n" +
                "	break;\n" +
                "	case 5 :\n" +
                "		System.out.println(\"On travail.\");\n" +
                "	break;\n" +
                "	case 6 :\n" +
                "		System.out.println(\"On joue ou je regarde un anime\");\n" +
                "	break;\n" +
                "	case 7 :\n" +
                "		System.out.println(\"Fini!\");\n" +
                "	break;\n" +
                "}";
        //Bas
        tab[0][3]="System.out.println(A un panneau Stop, je m'arrete 5 secondes);";
        tab[1][3]="for(int i=0;i<5){\n" +
                "	System.out.println(\"J'ai attendu \"+ i +\" seconde(s) à ce stop\");\n" +
                "	Thread.sleep(1000);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer.\");";
        tab[2][3]="if( voitureADroite() & pasDeSigne()\n" +
                "	System.out.println(\"Je laisse passer la voiture de droite.\");";
        tab[3][3]="while( voitureADroite() OR voitureAGauche()){\n" +
                "	Thread.sleep(500);\n" +
                "}\n" +
                "System.out.println(\"Je peux démarrer.\");";
        tab[4][3]="Switch( getAlcoolemie() ){\n" +
                "	case 0\n" +
                "		System.out.println(\"Je peux conduire\");\n" +
                "	break\n" +
                "	case 1\n" +
                "		System.out.println(\"Risque d'accident\");\n" +
                "	break\n" +
                "	case 2\n" +
                "		System.out.println(\"Risque de mort\");\n" +
                "	break\n" +
                "	case 3\n" +
                "		System.out.println(\"Comment je suis encore debout ?\");\n" +
                "	break\n" +
                "}";
        int i,j;
        for(i=0;i<5;i++)
            for(j=0;j<4;j++)
                if(tab[i][j].equals(str))
                    return 1+j;
        return 0;
    }


    public static int rand(int x){ //fonction qui retourne un nombre aleatoire entre 0 et x sécurisé.
        int res;
        do{
            res = (int)(Math.random()*x);
        }while(res == x);
        return res;
    }
    
}
