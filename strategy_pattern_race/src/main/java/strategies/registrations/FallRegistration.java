package strategies.registrations;

import entities.Document;
import entities.Runner;

import java.util.Set;
import java.util.stream.Collectors;

public class FallRegistration implements IRegistrationProcess
{
    @Override
    public Set<Runner> validateRunners(Set<Runner> runners)
    {
        Document registrationDoc = new Document("Fall Registration");
        Document waiver = new Document("Liability Waiver");

        return runners.stream()
            .filter(runner -> {
                return runner.getDocuments().contains(registrationDoc) &&
                       runner.getDocuments().contains(waiver);
            })
            .collect(Collectors.toSet());
    }
}
