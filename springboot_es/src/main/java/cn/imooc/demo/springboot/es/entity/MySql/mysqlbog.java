package cn.imooc.demo.springboot.es.entity.MySql;
import lombok.Data

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**

 *@description 

 *@params  

 *@return  

 *@author  chenjie

 *@cratetime  2020/5/17
 
 */
@Data
@Table(name="t_blog")
public class mysqlbog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}

