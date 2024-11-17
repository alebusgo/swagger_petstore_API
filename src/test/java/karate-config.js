function fn(){

    var env = karate.env;
    karate.log('karate.env = ',env);

    if(!env){
        env = 'qa';
    }

    var config = {
        apiUrl: 'http://localhost:8080/'
    }

    if(env == 'qa'){
        config.user = 'qa_user'
        config.pass = 'qa_password'
    } else if(env == 'uat'){
        config.user = 'another'
        config.pass = 'another'
    }
return config;

}