class LogicsLB
{
    private double weightOfLB;
    double weightInLB;
    double totalWeight;
    double davitWeight;


    void weightInLbCalc(String LBweight, String PeopleNo, double personWeight)
    {
        if (!LBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals(""))
        {
            double noOfPeople;
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInLB = (weightOfLB * 0.1) + (noOfPeople * personWeight * 1.1);
            weightInLB *=10;
            weightInLB = Math.round(weightInLB);
            weightInLB /= 10;
        }
    }

    void totalWeightCalc(String LBweight, String PeopleNo)
    {
        if (!LBweight.replaceAll("[^0-9.]", "").equals("") && !PeopleNo.replaceAll("[^0-9.]", "").equals(""))
        {
            weightOfLB = Double.parseDouble(LBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfLB + weightInLB;
        }
    }

    void davitWeightCalc()
    {
        davitWeight = totalWeight;
    }
}
