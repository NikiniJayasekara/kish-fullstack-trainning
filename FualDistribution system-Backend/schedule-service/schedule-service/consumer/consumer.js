/*import {Kafka} from 'kafkajs';

const kafka = new Kafka({
  clientId: 'schedule-service',
  brokers: ['localhost:9092'],
});

const consumer = kafka.consumer({
  groupId: 'project',
  //this is to disable retry on faulure during process. so it start with last commited offset instead of first offset of the batch
  retry: {
    initialRetryTime: 100,
    retries: 0,
  },
});
await consumer.subscribe({topic: 'order', fromBeginning: true});

await consumer.run({
  autoCommit: false,
  eachMessage: async ({topic, partition, message}) => {
    console.log({
      partition,
      offset: message.offset,
      value: message.value.toString(),
    });
  },
});*/