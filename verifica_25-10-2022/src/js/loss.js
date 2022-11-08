var random;
var scelta;

function gioca(){
        document.getElementById("button").hidden=true;
        document.getElementById("player1").hidden=true;
        document.getElementById("num").hidden=true;
        document.getElementById("imgIniziale").hidden=true;
        document.getElementById("imgGioco").hidden=false;
    
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
    }else{
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("carta_sx").hidden=false;
        document.getElementById("sasso_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
    }
    
}

function forbice(){
    newRandom();
    if(scelta=="carta"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("forbice_sx").hidden=false;
        document.getElementById("carta_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
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
    }

}

function sasso(){
    newRandom();
    if(scelta=="carta"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("carta_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai perso!";
    }else if(scelta=="forbice"){
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("forbice_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="hai vinto!";
    }else{
        document.getElementById("imgGioco").hidden=true;
        document.getElementById("sasso_sx").hidden=false;
        document.getElementById("sasso_dx").hidden=false;
        document.getElementById("vincitore").hidden=false;
        document.getElementById("vincitore").value="pareggio";
    }

}