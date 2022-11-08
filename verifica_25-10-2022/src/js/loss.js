var random;
var scelta;
var punteggioUser;
var punteggioPc;

function gioca(){
        document.getElementById("button").hidden=true;
        document.getElementById("player1").hidden=true;
        document.getElementById("num").hidden=true;
        document.getElementById("imgIniziale").hidden=true;
        document.getElementById("imgGioco").hidden=false;
        document.getElementById("btnProssimaManche").hidden=true;
        document.getElementById("carta_sx").hidden=true;
        document.getElementById("carta_dx").hidden=true;
        document.getElementById("forbice_sx").hidden=true;
        document.getElementById("forbice_dx").hidden=true;
        document.getElementById("sasso_sx").hidden=true;
        document.getElementById("sasso_dx").hidden=true;
    
}

function newRandom(){
    random = Math.floor(Math.random() * 3) + 1;
    switch(random){
        case 1:
            scelta="carta";
            break;
        case 2:
            scelta="forbice";
            break;

        case 3:
            scelta="sasso";
            break;
    }

}
function carta(){
    newRandom();
    if(scelta=="carta"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("carta_sx").hidden=false;
        document.getElementById("carta_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="pareggio";
    }else if(scelta=="forbice"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("carta_sx").hidden=false;
        document.getElementById("forbice_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai perso!";
        punteggioPc++;
    }else{
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("carta_sx").hidden=false;
        document.getElementById("sasso_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
        punteggioUser++;
    }
    document.getElementById("btnProssimaManche").hidden=false;
}

function forbice(){
    newRandom();
    if(scelta=="carta"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("forbice_sx").hidden=false;
        document.getElementById("carta_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
        punteggioUser++;
    }else if(scelta=="forbice"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("forbice_sx").hidden=false;
        document.getElementById("forbice_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="pareggio";
    }else{
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("forbice_sx").hidden=false;
        document.getElementById("sasso_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai perso!";
        punteggioPc++;
    }
    document.getElementById("btnProssimaManche").hidden=false;

}

function sasso(){
    newRandom();
    if(scelta=="carta"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("carta_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai perso!";
        punteggioPc++;
    }else if(scelta=="forbice"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("forbice_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
        punteggioUser++;
    }else{
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("sasso_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="pareggio";
    }
    document.getElementById("btnProssimaManche").hidden=false;

}