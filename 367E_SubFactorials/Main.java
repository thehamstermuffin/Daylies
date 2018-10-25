/*Most everyone who programs is familiar with the factorial - n! - of a number, the product of the series from n to 1. One interesting aspect of the factorial operation is that it's also the number of permutations of a set of n objects.

Today we'll look at the subfactorial, defined as the derangement
of a set of n objects, or a permutation of the elements of a set, such that no element appears in its original position. We denote it as !n.

Some basic definitions:

    !1 -> 0 because you always have {1}, meaning 1 is always in it's position.
    !2 -> 1 because you have {2,1}.
    !3 -> 2 because you have {2,3,1} and {3,1,2}.

And so forth.

Today's challenge is to write a subfactorial program. Given an input n, can your program calculate the correct value for n?

Input Description

You'll be given inputs as one integer per line. Example:

5

Output Description

Your program should yield the subfactorial result. From our example:

44

Challenge Input

6
9
14

Challenge Output

!6 -> 265
!9 -> 133496
!14 -> 32071101049

Bonus

Try and do this as code golf - the shortest code you can come up with.

Double Bonus

Enterprise edition - the most heavy, format, ceremonial code you can come up with in the enterprise style.
Notes

This was inspired after watching the Mind Your Decisions video about the "3 3 3 10" puzzle, where a subfactorial was used in one of the solutions.

*/

//no estoy seguro de que funcione con 14???
class Main{
  public static void main(String[] args){
    int n=14;//inputh
    SubFact s= new SubFact();

    System.out.println(s.subfact(n));
  }
}

//Clase subfactorial
//metodos subfact, fact
class SubFact{

 public double subfact(int n){
   //obtener factorial de n
   int f=fact(n);
   //obtener sumatoria
   double sum=0;
//   double test=0;
   for(int i=0;i<=n;i++){
     //sum+=(Math.pow(-1,i)/(fact(i)));
     sum+=(Math.pow(-1,i)/fact(i));
//     test=Math.pow(-1,i);
//     System.out.println(i + " factorial = " + fact(i) + " potencia " +  test/fact(i));
   }
   //consegur subfactorial
   return (double)f*sum;


 }

 int fact(int n){
   int fact=1; //debe empezar en uno para evitar dividir entre cero, ademas factorial de cero es 1
   for(int i=n;i>0;i--){
     fact=fact*i;
   }
   return fact;
 }
}
