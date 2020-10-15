package edu.greenriver.it.thymeleafdemo.model;

public enum Sale
{
    ON_SALE,
    ONE_TIME_ONLY,
    PREMIER_DEAL,
    NO_SALE;

    @Override
    public String toString()
    {
        return this.name().replace("_", " ").toLowerCase();
    }
}

