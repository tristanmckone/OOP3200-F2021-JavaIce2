package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

public class Vector2D
{
    // PRIVATE INSTANCE VARIABLES
    private float x;
    private float y;




    // PUBLIC PROPERTIES
    public float getX()
    {
        return x;
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public float getY()
    {
        return y;
    }

    public void setY(float y)
    {
        this.y = y;
    }
    public void set(float x, float y)
    {
        this.x = x;
        this.y = y;

    }

    // CONSTRUCTORS
    Vector2D()
    {
        this.x =0;
        this.y =0;
    }
    Vector2D(float x, float y)
    {
        set(x, y);
    }

    Vector2D(@NotNull Vector2D vector)
    {
        set(vector.getX(), vector.getY());
    }


    // PRIVATE METHODS

    // PUBLIC METHODS
    public void add(Vector2D rhs)
    {
        this.setX(this.getX() + rhs.getX());
        this.setY(this.getY() + rhs.getY());
    }

    public void subtract(Vector2D rhs)
    {
        this.setX(this.getX() - rhs.getX());
        this.setY(this.getY() - rhs.getY());

    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    // STATIC METHODS


}
