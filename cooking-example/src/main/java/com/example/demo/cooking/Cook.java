package com.example.demo.cooking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
public class Cook
{
    private Recipe current;

    //use constructor DI
    public Cook(Recipe current)
    {
        this.current = current;
    }
}
