/**
 * Create time
 */
package com.weapp.common.constant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Hao on .
 * description。
 * @since 1.9.0
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ErrorResponse implements Serializable {

    private String msg;
    
}
