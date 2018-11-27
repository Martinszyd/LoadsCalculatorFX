class LogicsLR
{
    static double davitWeight;

    static void davitWeightCalc(String SWLStr)
    {
        if (!SWLStr.equals("")) {
            double SWL;
            SWL = Double.parseDouble(SWLStr.replaceAll("[^0-9.]", ""));
            davitWeight = SWL * 1.1;
            davitWeight *= 10;
            davitWeight = Math.round(davitWeight);
            davitWeight /= 10;
        }
    }
}
