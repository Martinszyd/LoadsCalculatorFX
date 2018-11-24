public class LogicsLB
{
    double weightOfLB;
    double weightInLB;
    double totalWeight;
    double davitWeight;
    double noOfPeople;


    double weightInLbCalc(String LBweight, String PeopleNo, double personWeight)
    {
        if (!LBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals("") && personWeight!=0)
        {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * personWeight * 1.1);
            weightInLB *=10;
            weightInLB = Math.round(weightInLB);
            weightInLB /= 10;
        }
        else
        {
            weightInLB = 0;
        }
        return weightInLB;
    }

    double totalWeightCalc(String LBweight, String PeopleNo, double personWeight)
    {
        if (!LBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals("") && personWeight!=0)
        {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfLB + weightInLB;
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
