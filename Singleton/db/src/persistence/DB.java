package db.src.persistence;

import db.src.api.DatabaseAPI;

public enum DB implements DatabaseAPI
{
    INSTANCE;

    private int alter;

    @Override
    public synchronized int getAlter()
    {
        return alter;
    }

    @Override
    public synchronized String isPersonImRuhestand()
    {
        if (alter < 55)
        {
            return "Nein, nicht im Ruhestand";
        }
        else
            return "JA, im Ruhestand";
    }

    @Override
    public synchronized void saveNewAlter(int alter)
    {
        this.alter = alter;
    }
}