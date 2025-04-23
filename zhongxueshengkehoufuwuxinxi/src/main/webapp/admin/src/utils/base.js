const base = {
    get() {
        return {
            url : "http://localhost:8080/zhongxueshengkehoufuwuxinxi/",
            name: "zhongxueshengkehoufuwuxinxi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhongxueshengkehoufuwuxinxi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "中学生课后服务的信息管理"
        } 
    }
}
export default base
