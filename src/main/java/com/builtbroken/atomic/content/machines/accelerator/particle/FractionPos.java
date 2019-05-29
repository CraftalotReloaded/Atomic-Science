package com.builtbroken.atomic.content.machines.accelerator.particle;

import com.builtbroken.jlib.data.vector.IPos3D;

/**
 * Created by Dark(DarkGuardsman, Robert) on 2019-05-29.
 */
public class FractionPos implements  IMovablePos
{

    private final FractionAxis x = new FractionAxis(1000);
    private final FractionAxis y = new FractionAxis(1000);
    private final FractionAxis z = new FractionAxis(1000);

    @Override
    public void move(double x, double y, double z)
    {
        this.x.add(x);
        this.y.add(y);
        this.z.add(z);
    }

    @Override
    public void set(double x, double y, double z)
    {
        this.x.set(x);
        this.y.set(y);
        this.z.set(z);
    }

    @Override
    public double z()
    {
        return z.get();
    }

    @Override
    public double x()
    {
        return x.get();
    }

    @Override
    public double y()
    {
        return y.get();
    }
}
