/*Para cada objeto "obj" contido no vetor vect faça:*/
String[] vect = new String[] {"Maria", "Bob", "Alex"};
for (int i=0; i< vect.length; i++) {
System.out.println(vect[i]); 
}
/*Ambos tem o mesmo resultado, no caso do ForEach vai percorrer cada elemento do vetor, e vai pegar o valor da vez para si*/
for (String obj : vect) {
System.out.println(obj);
}
