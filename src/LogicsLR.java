public class LogicsLR
{
    static double SWL;
    static double davitWeight = 0.0;

    static double davitWeightCalc(String SWLStr){

        if (!SWLStr.equals("")) {
            SWL = Double.parseDouble(SWLStr.replaceAll("[^0-9.]", ""));
            davitWeight = SWL * 1.1;
            davitWeight *= 10;
            davitWeight = Math.round(davitWeight);
            davitWeight /= 10;
        }
        else {
            davitWeight = 0;
        }
        return davitWeight;
    }
}
