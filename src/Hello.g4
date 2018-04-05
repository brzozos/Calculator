grammar Hello;
fragment SINGLE_SPACE: '\u0020';
fragment TABULATION: '\u0009';
WhiteSpace: ( SINGLE_SPACE | TABULATION )+ -> skip;


DEC : (([1-9][0-9]*)('1' | '3' | '5' | '7' | '9')) | ('1' | '3' | '5' | '7' | '9');
HEX : ('0')('x')([0-9] | ('A'..'F'))* ('1' | '3' | '5' | '7' | '9' | 'B' | 'D' | 'F');
OCT : ('0')[0-7]* ('1' | '3' | '5' | '7');

ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

number : num = (DEC | HEX | OCT);

expr : expr op1=(MUL | DIV) expr
     | expr op2=(ADD | SUB) expr
     | number
     | '(' expr ')';