#!/usr/bin/env bash
# 需要安装docker-compose
# curl -L https://github.com/docker/compose/releases/download/1.23.2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
# chmod +x /usr/local/bin/docker-compose
#
rootPath="";
#切到项目根路径
function gotodir() {
    filepath=$(cd "$(dirname "$0")"; pwd)
    cd $filepath/../../;
    rootPath=$(pwd);
}

function build() {
    source $rootPath"/devops/bin/"buildAppImage.sh;
    source $rootPath"/devops/bin/"buildMysqlImages.sh;
}

gotodir
build