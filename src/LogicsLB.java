public class LogicsLB
{
   // String LBweight;
    //String PeopleNo;
    double weightOfLB;
    double weightInLB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;
    double noOfPeople;

    GraphicsController controller = new GraphicsController();

    double weightInLbCalc()
    {
        //LBweight = controller.getLBweight();
        //PeopleNo = String.valueOf(controller.getLBpeople());

        if (!controller.getLBweight().equals("") && !controller.getLBpeople().equals(""))
        {
            weightOfLB = Double.parseDouble(controller.getLBweight().replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(controller.getLBpeople().replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * GraphicsController.getLBpersonWeight() * 1.1);
            weightInLB *=10;
            weightInLB = Math.round(weightInLB);
            weightInLB /= 10;
        }
        else {
            weightInLB = 0;
        }
        return weightInLB;
    }

    double totalWeightCalc()
    {
        //LBweight = String.valueOf(controller.getLBweight());

        if (!controller.getLBweight().equals("") && !controller.getLBpeople().equals(""))
        {
            weightOfLB = Double.parseDouble(controller.getLBweight().replaceAll("[^0-9.]", ""));
            totalWeight = weightOfLB + weightInLB;
        } else {
            totalWeight = 0;
        }
        return totalWeight;
    }

    double davitWeightCalc()
    {
        davitWeight = totalWeight;

        return davitWeight;
    }
}
