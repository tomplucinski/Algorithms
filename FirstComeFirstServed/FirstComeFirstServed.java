public class FirstComeFirstServed {

    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
        int takeOutOrdersIndex = 0;
        int dineInOrdersIndex = 0;

        for (int order : servedOrders) {

            if (takeOutOrdersIndex < takeOutOrders.length && order == takeOutOrders[takeOutOrdersIndex]) {
                takeOutOrdersIndex++;

            } else if (dineInOrdersIndex < dineInOrders.length && order == dineInOrders[dineInOrdersIndex]) {
                dineInOrdersIndex++;

            } else {
                return false;
            }
        }

        if (dineInOrdersIndex != dineInOrders.length || takeOutOrdersIndex != takeOutOrders.length) {
            return false;
        }

        return true;
    }
}
