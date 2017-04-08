# Logr 
[![](https://jitpack.io/v/braj24/Loginregs.svg)](https://jitpack.io/#braj24/Loginregs)

This is a test library.

# Download

Add it in your root build.gradle at the end of repositories:
	   
       allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Add the dependencies

    dependencies {
         compile 'com.github.braj24:testlib:1.0.2'
    }
    
 or
    
     dependencies {
	  compile 'com.github.User:Repo:Tag'
     }
     
# Usage
For login

     Login login=new Login(context,"username","password","post_url_login");
     login.runLogin();

For Registration

    Register register =new Register(context,"username","emailid","password","post_url_registration");
    runRegister();

# LICENSE

Copyright 2017 Braj Bhushan Singh

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
   
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
