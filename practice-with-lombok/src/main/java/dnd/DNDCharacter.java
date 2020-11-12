package dnd;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Builder
public class DNDCharacter
{
    private String name;
    private String backStory;
    private Map<String, Object> stats;

    public void burnTheVillage()
    {
        //do something...
    }
}
