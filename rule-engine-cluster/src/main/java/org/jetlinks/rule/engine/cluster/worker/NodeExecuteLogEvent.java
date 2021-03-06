package org.jetlinks.rule.engine.cluster.worker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetlinks.rule.engine.cluster.logger.LogInfo;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class NodeExecuteLogEvent implements Serializable {
    private LogInfo logInfo;
}
