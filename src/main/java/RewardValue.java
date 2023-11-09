public class RewardValue {
   double cash;
   int miles;

   RewardValue(double cash){
       this.cash = cash;
   }
   RewardValue(int miles){
       this.miles = miles;
   }

    public double getCashValue(){
        return miles / .0035;
    }

    public double getMilesValue(){
        return cash * .0035;
    }
}
