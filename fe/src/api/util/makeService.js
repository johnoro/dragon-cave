import axios from 'axios';

const HOST = 'http://localhost:8080/';

export default (path) => {
    const ENDPOINT = HOST + path;
    return {
        'retrieveAll': () => axios.get(ENDPOINT),
        'retrieve': (id) => axios.get(`${ENDPOINT}/${id}`),
        'delete': (id) => axios.delete(`${ENDPOINT}/${id}`),
        'update': (id, updatedObj) => axios.put(`${ENDPOINT}/${id}`, updatedObj),
        'create': (newObj) => axios.post(ENDPOINT, newObj)
    };
};