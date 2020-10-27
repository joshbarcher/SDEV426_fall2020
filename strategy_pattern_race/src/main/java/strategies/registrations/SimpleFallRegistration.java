package strategies.registrations;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class SimpleFallRegistration implements IRegistrationProcess
{
    @Override
    public Set<Runner> validateRunners(Set<Runner> runners)
    {
        Document registrationDoc = new Document("Fall Registration");

        return runners.stream()
            .filter(runner -> runner.getDocuments().contains(registrationDoc))
            .collect(Collectors.toSet());
    }
}
