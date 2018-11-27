class LogicsRB
{
    private double weightOfRB;
    double weightInRB;
    double totalWeight;
    double davitWeight;


    void weightInRbCalc(String RBweight, String PeopleNo,double personWeight)
    {
        if (!RBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals(""))
        {
            double noOfPeople;
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * personWeight * 1.1);
            weightInRB *= 10;
            weightInRB = Math.round(weightInRB);
            weightInRB /= 10;
        }
    }

    void totalWeightCalc(String RBweight, String PeopleNo)
    {
        if (!RBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals(""))
        {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfRB + weightInRB;
        }
    }

    void davitWeightCalc()
    {
        davitWeight = totalWeight;
    }
}
