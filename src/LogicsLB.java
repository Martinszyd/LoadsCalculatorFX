public class LogicsLB
{
    String LBweight;
    //String PeopleNo;
    double weightOfLB;
    double weightInLB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;
    double noOfPeople;

    GraphicsController controller = new GraphicsController();

    double weightInLbCalc()
    {
        LBweight = String.valueOf(controller.LBweight.getText());
        if (!LBweight.equals("") && !String.valueOf(controller.LBpeople.getText()).equals(""))
        {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(String.valueOf(controller.LBpeople.getText()).replaceAll("[^0-9.]", ""));
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

        if (!String.valueOf(controller.LBweight).equals("") && !String.valueOf(controller.LBpeople).equals(""))
        {
            weightOfLB = Double.parseDouble(String.valueOf(controller.LBweight).replaceAll("[^0-9.]", ""));
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
