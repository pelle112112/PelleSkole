#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>
#define max 182

//Kamp-structen bliver genereret med typedef
typedef struct kampe
{
    char ugedag[5];
    char dato[max];
    char klokkeslaet[max];
    char hold1[max];
    char hold2[max];
    int score1;
    int score2;
    int tilskuere;
}kampe;

//Hold-structen bliver genereret med typedef
typedef struct hold
{
    char holdnavn[max];
    int holdpoint;
    int maal_for;
    int maal_imod;
}hold;
void kampe_scan (kampe *k, hold *h);
void liga_array(kampe *k, hold *h, int i);
int cmpfunc(const hold * a, const hold * b);


int main(void){
    kampe k[max];
    hold h[max];
    kampe_scan (k, h);
}

//I funktionen bliver kampene scannet ind i kampe-structen med fscanf
void kampe_scan (kampe *k, hold *h){

    int i = 0;
    FILE *fp;
    fp = fopen("kampe-2019-2020.txt", "r");
    if (fp == NULL)
    {
        printf("Filen kunne ikke åbnes");
    }
    
    //Her tager min funktion også liga_array funktionen ind.
    //Dette gøres, så liga_array får "i" som input. I går gennem kampene i et for-loop
    while(fscanf(fp, "%s %s %s %s - %s %d - %d %d",
    k[i].ugedag, k[i].dato, k[i].klokkeslaet, k[i].hold1,
    k[i].hold2, &k[i].score1, &k[i].score2, &k[i].tilskuere)!=EOF)
    { 
        liga_array(k, h, i);
        i++;
    }

    //Funktionen printer holdene ud i en tabel med point og målscorer
    printf("\n| Hold | Point | Mål  | Mål imod |\n");
    printf("|______|_______|______|__________|");
    for(int a = 0; a < 14; a++){
        qsort(h, 14, sizeof(hold), cmpfunc);
        if(strcmp(h[a].holdnavn, "OB") == 0){
            strcpy(h[a].holdnavn, "OB ");
        }
        printf("\n| %s  |  %d   |  +%d |   -%d    |",
        h[a].holdnavn, h[a].holdpoint, h[a].maal_for, h[a].maal_imod); 
    }
    printf("\n");

    fclose(fp);
}

void liga_array(kampe *k, hold *h, int i){
    int x =0;
    //Holdene er hardcodet ind i min hold-struct
    strcpy(h[0].holdnavn, "FCM");
    strcpy(h[1].holdnavn, "OB");
    strcpy(h[2].holdnavn, "FCK");
    strcpy(h[3].holdnavn, "RFC");
    strcpy(h[4].holdnavn, "LBK");
    strcpy(h[5].holdnavn, "SDR");
    strcpy(h[6].holdnavn, "AaB");
    strcpy(h[7].holdnavn, "EFB");
    strcpy(h[8].holdnavn, "ACH");
    strcpy(h[9].holdnavn, "BIF");
    strcpy(h[10].holdnavn, "SIF");
    strcpy(h[11].holdnavn, "FCN");
    strcpy(h[12].holdnavn, "HOB");
    strcpy(h[13].holdnavn, "AGF");

    for (x = 0; x < 14; x++){
        //Her bliver der søgt efter de specifikke hold på hjemmebane
        if(strcmp(h[x].holdnavn, k[i].hold1) == 0){
            if(k[i].score1 == k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 1;
                h[x].maal_for = h[x].maal_for + k[i].score1;
                h[x].maal_imod = h[x].maal_imod + k[i].score2;
            }
            else if(k[i].score1 > k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 3;
                h[x].maal_for = h[x].maal_for + k[i].score1;
                h[x].maal_imod = h[x].maal_imod + k[i].score2;
            }
            else if(k[i].score1 < k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 0;
                h[x].maal_for = h[x].maal_for + k[i].score1;
                h[x].maal_imod = h[x].maal_imod + k[i].score2;
            }
        }
        //Her bliver der søgt efter de specifikke hold på udebane
        if (strcmp(h[x].holdnavn, k[i].hold2) == 0){

            if(k[i].score1 == k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 1;
                h[x].maal_for = h[x].maal_for + k[i].score2;
                h[x].maal_imod = h[x].maal_imod + k[i].score1;
            }
            else if(k[i].score1 > k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 0;
                h[x].maal_for = h[x].maal_for + k[i].score2;
                h[x].maal_imod = h[x].maal_imod + k[i].score1;
            }
            else if(k[i].score1 < k[i].score2){
                h[x].holdpoint = h[x].holdpoint + 3;
                h[x].maal_for = h[x].maal_for + k[i].score2;
                h[x].maal_imod = h[x].maal_imod + k[i].score1;
            }
        }
    }
}
//cmpfunc bliver brugt i qsort til at sortere holdene efter point
int cmpfunc(const hold * a, const hold * b)
{
    int holdpointA = a->holdpoint;
    int holdpointB = b->holdpoint;

    return holdpointB - holdpointA;
}