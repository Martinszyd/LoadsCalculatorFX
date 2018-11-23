public class LogicsRB
{
    //String RBweight;
   // String PeopleNo;
    double weightOfRB;
    double weightInRB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;
    double noOfPeople;

    GraphicsController controller = new GraphicsController();

    double weightInRbCalc()
    {
        //RBweight = String.valueOf(controller.RBweightStr);
        //PeopleNo = String.valueOf(controller.getRBpeople());

        if (!String.valueOf(controller.RBweight).equals("") && !String.valueOf(controller.RBpeople).equals(""))
        {
            weightOfRB = Double.parseDouble(String.valueOf(controller.RBweight).replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(String.valueOf(controller.RBpeople).replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * GraphicsController.getRBpersonWeight() * 1.1);
            weightInRB *= 10;
            weightInRB = Math.round(weightInRB);
            weightInRB /= 10;
        }
        else
        {
            weightInRB = 0;
        }
        return weightInRB;
    }

    double totalWeightCalc()
    {
        //RBweight = String.valueOf(controller.getRBweight());

        if (!String.valueOf(controller.RBweight).equals("") && !String.valueOf(controller.RBpeople).equals(""))
        {
            weightOfRB = Double.parseDouble(String.valueOf(controller.RBweight).replaceAll("[^0-9.]", ""));
            totalWeight = weightOfRB + weightInRB;
        }
        else
        {
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
