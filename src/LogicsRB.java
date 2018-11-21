public class LogicsRB
{
    String RBweight;
    String PeopleNo;
    double weightOfRB;
    double weightInRB = 0.0;
    double totalWeight = 0.0;
    double davitWeight = 0.0;
    double noOfPeople;

    double weightInRbCalc() {

        if (!RBweight.equals("") && !PeopleNo.equals("")) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            noOfPeople = Double.parseDouble(PeopleNo.replaceAll("[^0-9.]", ""));
            weightInRB = (weightOfRB * 0.1) + (noOfPeople * RBPanel.getPersonWeight() * 1.1);
            weightInRB *= 10;
            weightInRB = Math.round(weightInRB);
            weightInRB /= 10;
        }
        else {
            weightInRB = 0;
        }
        return weightInRB;
    }

    double totalWeightCalc() {
        if (!RBweight.equals("") && !PeopleNo.equals("")) {
            weightOfRB = Double.parseDouble(RBweight.replaceAll("[^0-9.]", ""));
            totalWeight = weightOfRB + weightInRB;
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
