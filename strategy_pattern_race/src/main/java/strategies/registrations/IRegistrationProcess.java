package strategies.registrations;

import entities.Runner;
import java.util.Set;

public interface IRegistrationProcess
{
    Set<Runner> validateRunners(Set<Runner> runners);
}
