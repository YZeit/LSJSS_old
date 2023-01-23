package lsjss.functions;

import ec.*;
import ec.gp.*;
import lsjss.main.DoubleData;
import lsjss.main.LSJSS_GPHH;

public class PT extends GPNode
{
    public String toString() { return "PT"; }

    public int expectedChildren() { return 0; }

    public void eval(final EvolutionState state,
                     final int thread,
                     final GPData input,
                     final ADFStack stack,
                     final GPIndividual individual,
                     final Problem problem)
    {
        DoubleData rd = ((DoubleData)(input));
        rd.x = ((LSJSS_GPHH)problem).currentPT;
    }
}
