0.7 => 0.8
==============

1. Build registry-db-migrator
2. Copy registry-db-migrator-0.8-SNAPSHOT.jar and commons-cli-1.1.jar (you will find this in your maven repository) to <AIRAVATA_HOME>/lib
3. Copy db-migrate.sh file to <AIRAVATA_HOME>/bin
4. Make sure previous version of airavata database is up and running
5. Run db-migrate.sh script file
        ./db-migrate.sh -url jdbc:mysql://localhost:3306/experiment_catalog -user airavata -pwd airavata -v 0.7