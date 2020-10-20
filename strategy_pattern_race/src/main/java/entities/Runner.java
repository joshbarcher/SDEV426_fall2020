package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Runner
{
    private String name;
    private List<Document> documents;
}

