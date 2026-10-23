Pseudo codi:

    INICI

    DEFINIR primerarray COM ARRAY DE 5 ENTERS
    DEFINIR segonarray COM ARRAY DE 5 ENTERS
    DEFINIR arrayresultat COM ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A 4
        ESCRIURE "Escriu el valor ", i + 1, " del primer array."
        LLEGIR primerarray[i]
    FI_PER

    PER i DES DE 0 FINS A 4
        ESCRIURE "Escriu el valor ", i + 1, " del segon array."
        LLEGIR segonarray[i]
    FI_PER

    PER i DES DE 0 FINS A 4
        arrayresultat[i] ← primerarray[i] + segonarray[i]
    FI_PER

    ESCRIURE "Valors del primer array: "
    PER i DES DE 0 FINS A 4
        ESCRIURE primerarray[i], " "
    FI_PER

    ESCRIURE "Valors del segon array: "
    PER i DES DE 0 FINS A 4
        ESCRIURE segonarray[i], " "
    FI_PER

    ESCRIURE "Resultats: "
    PER i DES DE 0 FINS A 4
        ESCRIURE arrayresultat[i], " "
    FI_PER

    FINAL
