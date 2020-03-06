grammar Field;

field:
    //(intDefinition NL)+ (vetorDefinition NL)+ (calSomaLanche NL)+
    
    (quadribol_match NL)+
    (quadribol_players NL)+
    (losepoint_match NL)?
    (addpoint_match NL)?
    (losepoint_match NL)?
    (multpoint_match NL)?
    (divpoint_match NL)?
    (end_match NL)?
    EOF;
    


quadribol_match:value=(Int|Real) ' partida de quadribol em hogwarts';
quadribol_players:'Cada time sera composto por ' quant=Int ' jogadores';
addpoint_match: 'O time ganhou ' value1=(Int|Real) ' apos arremeço que vale ' value2= (Int|Real) ' pontos';
losepoint_match: 'O time perdeu ' value1= (Int|Real) ' pontos do total de ' value2 = (Int|Real) ' pontos';
multpoint_match: 'Dumbledore viu harry e multiplicou ' value1= (Int|Real) ' vezes os pontos ' value2= (Int|Real) ;
divpoint_match: 'Dumbledore viu tom riddle e dividiu ' value1 = (Int|Real) ' vezes os pontos ' value2= (Int|Real);
end_match: 'Fim de partida';

Name: ('A'..'Z' | 'a'..'z' | ' ')+ ;
Int: ('0'..'9')+ ;
Real: (Int+'.'Int+);

WS: (' ' | '\t')+;
NL:  '\r'? '\n';
