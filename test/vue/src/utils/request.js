// import axios from 'axios';
// import { ElMessage } from 'element-plus';
// import router from '@/router';

// // 创建 axios 实例并设置基础 URL 和超时时间
// const axiosInstance = axios.create({
//     baseURL: 'http://localhost:7071', // 你的后端服务地址
//     timeout: 30000 // 请求超时时间设置为30秒
// });

// // 请求拦截器
// axiosInstance.interceptors.request.use(config => {
//     config.headers['Content-Type'] = 'application/json;charset=utf-8';
//     return config;
// }, error => {
//     return Promise.reject(error);
// });

// // 响应拦截器
// axiosInstance.interceptors.response.use(
//     response => {
//         let res = response.data;
//         // 将字符串响应转换为JSON对象
//         if (typeof res === 'string') {
//             res = res ? JSON.parse(res) : res;
//         }
//         return res;
//     },
//     error => {
//         // 这里可以处理请求失败的逻辑，例如显示错误信息等
//         if (error.response?.status === 404) {
//             ElMessage.error('未找到请求接口');
//         } else if (error.response?.status === 500) {
//             ElMessage.error('系统异常,请查看后端控制台报错');
//         } else {
//             console.error(error.message);
//         }
//         return Promise.reject(error);
//     }
// );

// // 封装请求函数
// async function request(endpoint, data = {}, method = 'GET', config = {}) {
//     try {
//         const response = await axiosInstance.request({
//             url: endpoint,
//             method: method,
//             data: method === 'POST' || method === 'PUT' ? data : null,
//             params: method === 'GET' ? data : null,
//             ...config
//         });
//         return response;
//     } catch (error) {
//         console.error('Request error:', error);
//         throw error;
//     }
// }

// // 封装其他 HTTP 方法
// async function get(endpoint, params = {}, config = {}) {
//     return request(endpoint, params, 'GET', config);
// }

// async function post(endpoint, data = {}, config = {}) {
//     return request(endpoint, data, 'POST', config);
// }

// async function put(endpoint, data = {}, config = {}) {
//     return request(endpoint, data, 'PUT', config);
// }

// async function del(endpoint, data = {}, config = {}) {
//     return request(endpoint, data, 'DELETE', config);
// }

// // 导出 axios 实例和封装的请求函数
// export default { axiosInstance, request, get, post, put, del };

// request.js
import axios from 'axios';
import { ElMessage } from 'element-plus';
import router from '@/router';

// 创建 axios 实例并设置基础 URL 和超时时间
const request = axios.create({
    baseURL: 'http://localhost:7071', // 你的后端服务地址
    timeout: 30000 // 请求超时时间设置为30秒
});

// 请求拦截器
// 请求拦截器，设置请求头和处理请求错误
request.interceptors.request.use(config => {
    config.headers['Content-Type'] = 'application/json;charset=utf-8';
    return config;
}, error => {
    return Promise.reject(error)
});

// 响应拦截器
// 响应拦截器，处理响应数据和响应错误
request.interceptors.response.use(
    response => {
        let res = response.data;
        // 将字符串响应转换为JSON对象
        if (typeof res === 'string') {
            res = res ? JSON.parse(res) : res;
        }
        return res;
    },
    error => {
        // 这里可以处理请求失败的逻辑，例如显示错误信息等
        if (error.response.status === 404) {
            ElMessage.error('未找到请求接口')
        } else if (error.response.status === 500) {
            ElMessage.error('系统异常,请查看后端控制台报错')
        } else {
            console.error(error.message)
        }
        return Promise.reject(error)
    });

// 导出 request 实例供其他模块使用
// 这里不能用括号包住
export default request

// // 封装请求函数
// // 封装一个通用的请求函数，可以根据需要修改或扩展
// async function request(endpoint, data = {}, config = {}) {
//     try {
//         const response = await request(config ? config : {}).post(endpoint, data);
//         return response.data;
//     } catch (error) {
//         console.error('Request error:', error);
//         throw error;
//     }
// }

// // 使用示例
// // 在其他模块中使用 request.js
// import { request, get, post, put, delete } from './request.js';

// // 示例：发送 GET 请求
// async function fetchData() {
//     try {
//         const data = await get('/your-endpoint');
//         console.log(data);
//     } catch (error) {
//         console.error('Error fetching data:', error);
//     }
// }

// // 示例：发送 POST 请求
// async function postData() {
//     try {
//         const data = await post('/your-endpoint', { key: 'value' });
//         console.log(data);
//     } catch (error) {
//         console.error('Error posting data:', error);
//     }
// }

// fetchData();
// postData();
