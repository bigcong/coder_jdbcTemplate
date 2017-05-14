package com.cc.code.build;

import com.cc.code.connection.DataSourceConfig;
import com.cc.code.generator.Generator;

/**
 * @author bigcong
 */
public class Build {

    public static void main(String[] args) {
        try {
            generator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public static void generator() throws Exception {
            // 得到数据源
            DataSourceConfig cfg = new DataSourceConfig("com.mysql.jdbc.Driver", "jdbc:mysql://loalhost:3306/cc",
                    "root", "cc", DataSourceConfig.MYSQL);
            /**
             * 第一个参数:选择你要生成的表名,此参数可选。不写默认生成全部
             * 第二个参数:生成的文件的作存放的包名
             * 第三个参数:数据源配置
             * 第四个参数:生成目标文件的位置
             */
            Generator generator = new Generator(new String[]{"cc",}, "com.cc", cfg, "/Users/cong/cc/generate");
            generator.generate(true, true, true, true, true, true, true, true, true);
    }
}