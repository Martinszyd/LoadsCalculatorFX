class LogicsRB
{
    private double weightOfRB;
    double weightInRB;
    double totalWeight;
    double davitWeight;


    double weightInRbCalc(String RBweight, String PeopleNo,double personWeight)
    {
        if (!RBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals("") && personWeight!=0)
        {
            double noOfPeople;
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * personWeight * 1.1);
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

    double totalWeightCalc(String RBweight, String PeopleNo, double personWeight)
    {
        if (!RBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals("") && personWeight!=0)
        {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
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
