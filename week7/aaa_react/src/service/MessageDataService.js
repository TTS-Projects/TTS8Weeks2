import axios from 'axios'

const USER = 'miguel'
const MESSAGE_API_URL = 'http://localhost:8080'
const USER_API_URL = `${MESSAGE_API_URL}/users/${USER}`

class MessageDataService {

    retrieveAllMessages(name) {
        //console.log('executed service')
        return axios.get(`${USER_API_URL}/messages`);
    }

    retrieveMessage(name, id) {
        //console.log('executed service')
        return axios.get(`${USER_API_URL}/messages/${id}`);
    }

    deleteMessage(name, id) {
        //console.log('executed service')
        return axios.delete(`${USER_API_URL}/messages/${id}`);
    }

    updateMessage(name, id, course) {
        //console.log('executed service')
        return axios.put(`${USER_API_URL}/messages/${id}`, course);
    }

    createMessage(name, course) {
        //console.log('executed service')
        return axios.post(`${USER_API_URL}/messages/`, course);
    }
}

export default new MessageDataService()