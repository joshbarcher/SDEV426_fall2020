package strategies.registrations;

import entities.Runner;

import java.util.Set;

public class FreeForAllRegistration implements IRegistrationProcess
{
    @Override
    public Set<Runner> validateRunners(Set<Runner> runners)
    {
        return runners;
    }
}
