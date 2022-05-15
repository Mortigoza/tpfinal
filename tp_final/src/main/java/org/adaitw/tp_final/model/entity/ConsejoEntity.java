package org.adaitw.tp_final.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.adaitw.tp_final.model.dto.ConceptosDTO;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsejoEntity {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
