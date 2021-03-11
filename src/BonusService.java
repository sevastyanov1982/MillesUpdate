public class BonusService {
    public int calculate (int cost) {
        int bonus = cost / 20;
        return bonus;
    }

}














//    public class BonusService {
//    public long calculate(long amount, boolean registered) {
//        int percent = registered ? 3 : 1;
//        long bonus = amount * percent / 100 / 100;
//        long limit = 500;
//        if (bonus > limit) {
//            bonus = limit;
//        }
//        return bonus;
//    }
//}