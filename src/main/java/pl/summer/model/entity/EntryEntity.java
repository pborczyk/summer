package pl.summer.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Set;

/**
 * Created by Piotr Borczyk on 10.04.2017.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EntryEntity extends BaseEntity {

    private String content;

    @ManyToOne
    private UserEntity author;

    @ElementCollection
    private Set<String> hashTags;

    private int upvotes;

}
